<?php
include_once '../connect_to_db.php';

if (
    isset($_REQUEST['id_user']) &&
    isset($_REQUEST['tanggal']) &&
    isset($_REQUEST['total']) &&
    isset($_REQUEST['barang'])
) {
    $id_user = $_REQUEST['id_user'];
    $tanggal = $_REQUEST['tanggal'];
    $total = $_REQUEST['total'];
    $barang = array();

    //decode data barang from my own defined formatted string
    $barangAsString = explode(';', $_REQUEST['barang']);
    for ($i = 0; $i < count($barangAsString); ++$i) {
        $barang[$i] = explode('%', $barangAsString[$i]);
    }

    //insert penjualan data
    $conn->query(
        <<<SQL
        INSERT INTO penjualan (id_user,tanggal,total)
        VALUES('$id_user','$tanggal','$total');
        SQL
    );

    //get id_penjualan from the latest inserted data
    $res = $conn->query('SELECT LAST_INSERT_ID() FROM penjualan;');
    $id_penjualan = ($res->fetch_all(MYSQLI_NUM))[0][0];

    try {
        //insert detail penjualan data
        foreach ($barang as $d) {
            if (count($d) == 2) {
                $conn->query(
                    <<<SQL
                    INSERT INTO detail_penjualan (id_penjualan,id_barang,jumlah)
                    VALUES('$id_penjualan', '{$d[0]}', '{$d[1]}');
                    SQL
                );
            } else {
                throw new Exception('Kesalahan format : ' . $_REQUEST['barang']);
            }
        }

        if ($conn->error) {
            throw new Exception($conn->error);
        } else {
            echo 'success';
        }
    } catch (Exception $e) {
        //delete the new inserted penjualan data
        $conn->query(
            <<<SQL
            DELETE FROM penjualan
            WHERE id_penjualan = $id_penjualan;
            SQL
        );
        die('Error: ' . $e);
    }
} else {
    die('Error: No Argument');
}
