<?php
require_once('..\connect_to_db.php');

if (isset($_REQUEST['id_barang'], $_REQUEST['nama'], $_REQUEST['harga'], $_REQUEST['stok'])) {
    $queryToInsert = <<<SQL
        INSERT INTO barang (id_barang,nama,harga,stok) 
        VALUES(
            '{$_REQUEST['id_barang']}', '{$_REQUEST['nama']}', '{$_REQUEST['harga']}', '{$_REQUEST['stok']}'
        );
    SQL;

    $conn->query($queryToInsert);
    if ($conn->error) {
        die('Error: ' . $conn->error);
    }
    echo 'added';
} else {
    echo 'Error: no_argument';
}
