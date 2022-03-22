<?php
require_once('../connect_to_db.php');

$result;
if (isset($_REQUEST['id_barang'])) {
    $result = $conn->query("SELECT id_barang,nama,harga,stok FROM barang WHERE id_barang='{$_REQUEST['id_barang']}';");
} else {
    $result = $conn->query('SELECT id_barang,nama,harga,stok FROM barang;');
}

if ($conn->error) {
    die('Error: ' . $conn->error);
}

$datas = (array) $result->fetch_all(MYSQLI_ASSOC);
//encode datas to string with my own defined format
$datasAsString = 'Datas:';
for ($i = 0; $i < count($datas); ++$i) {
    $datasAsString .= <<<D
    {$datas[$i]['id_barang']},{$datas[$i]['nama']},{$datas[$i]['harga']},{$datas[$i]['stok']};
    D;
}
echo $datasAsString;
