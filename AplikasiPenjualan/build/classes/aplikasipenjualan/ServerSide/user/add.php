<?php
require_once('..\connect_to_db.php');

if (isset($_REQUEST['id_user'], $_REQUEST['nama'], $_REQUEST['password'])) {
    $queryToInsert = <<<SQL
        INSERT INTO user (id_user,nama,password) 
        VALUES(
            '{$_REQUEST['id_user']}', '{$_REQUEST['nama']}', '{$_REQUEST['password']}'
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
