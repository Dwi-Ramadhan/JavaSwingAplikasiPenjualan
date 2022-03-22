<?php
$conn = mysqli_connect('localhost', 'root', '', 'penjualan_barang', 3306);
if (mysqli_error($conn)) {
    die('Error:' . $conn->error);
}
