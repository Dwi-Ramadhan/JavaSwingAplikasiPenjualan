<?php
require_once('../connect_to_db.php');

if (isset($_REQUEST['id_user'])) {
    $conn->query("DELETE FROM user WHERE id_user='{$_REQUEST['id_user']}'");

    if ($conn->error) {
        die("Error: " . $conn->error);
    }
    echo "deleted";
} else {
    echo "Error: no_argument";
}
