<?php
require_once('../connect_to_db.php');

if (isset($_REQUEST['id_barang'])) {
    $conn->query("DELETE FROM barang WHERE id_barang='{$_REQUEST['id_barang']}'");

    if ($conn->error) {
        die("Error: " . $conn->error);
    }
    echo "deleted";
} else {
    echo "Error: no_argument";
}
