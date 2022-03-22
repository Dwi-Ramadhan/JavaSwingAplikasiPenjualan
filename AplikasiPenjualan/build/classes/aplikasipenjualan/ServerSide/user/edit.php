<?php
require_once('../connect_to_db.php');

if (isset($_REQUEST['id_user_lama'], $_REQUEST['id_user'], $_REQUEST['nama'], $_REQUEST['password'])) {
    $queryToEdit = <<<SQL
        UPDATE user SET id_user = '{$_REQUEST['id_user']}', nama = '{$_REQUEST['nama']}', password = '{$_REQUEST['password']}'
        WHERE id_user = '{$_REQUEST['id_user_lama']}';
    SQL;

    $conn->query($queryToEdit);
    if ($conn->error) {
        die('Error: ' . $conn->error);
    }
    echo 'edited';
} else {
    echo 'Error: no_argument';
}
