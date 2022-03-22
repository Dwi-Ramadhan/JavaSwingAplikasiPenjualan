<?php
require_once('../connect_to_db.php');

if (isset($_REQUEST['id_barang_lama'], $_REQUEST['id_barang'], $_REQUEST['nama'], $_REQUEST['harga'], $_REQUEST['stok'])) {
    $queryToEdit = <<<SQL
        UPDATE barang SET id_barang = '{$_REQUEST['id_barang']}', nama = '{$_REQUEST['nama']}', harga = '{$_REQUEST['harga']}', stok = '{$_REQUEST['stok']}'
        WHERE id_barang='{$_REQUEST['id_barang_lama']}';
    SQL;

    $conn->query($queryToEdit);
    if ($conn->error) {
        die('Error: ' . $conn->error);
    }
    echo 'edited';
} else {
    echo 'Error: no_argument';
}
