<?php
include_once '../connect_to_db.php';

$res = $conn->query(
    <<<SQL
    SELECT id_penjualan, nama, tanggal, total
    FROM user, penjualan
    WHERE penjualan.id_user = user.id_user;
    SQL
);

if ($res) {
    $datas = $res->fetch_all(MYSQLI_ASSOC);
    if ($datas) {
        $data_count = count($datas);

        for ($i = 0; $i < $data_count; ++$i) {
            $res = $conn->query(
                <<<SQL
                SELECT nama, jumlah
                FROM detail_penjualan, barang
                WHERE detail_penjualan.id_penjualan = {$datas[$i]['id_penjualan']} 
                && barang.id_barang = detail_penjualan.id_barang;
                SQL
            );
            if ($res) {
                $detail_penjualan = $res->fetch_all(MYSQLI_ASSOC);
                $datas[$i]['detail'] = $detail_penjualan;
            } else {
                die("Error: " . $conn->error);
            }
        }

        //encode data to my own definition formatted string
        $dataAsString = 'Datas:';
        foreach ($datas as $data) {
            $dataAsString .= "{$data['nama']},{$data['tanggal']},{$data['total']},";
            foreach ($data['detail'] as $detail) {
                $dataAsString .= "{$detail['nama']}%{$detail['jumlah']}#";
            }
            $dataAsString .= ";";
        }

        echo $dataAsString;
    } else {
        die("Error: " . $conn->error);
    }
} else {
    die("Error: " . $conn->error);
}
