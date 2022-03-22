<?php
include_once '../connect_to_db.php';

if (isset($_REQUEST['nama']) && isset($_REQUEST['pswd'])) {
    $result = $conn->query("SELECT id_user FROM user WHERE nama='{$_REQUEST['nama']}' AND password='{$_REQUEST['pswd']}';");
    if ($conn->error) {
        die('Error: ' . $conn->error);
    }
    $users = $result->fetch_all(MYSQLI_NUM);
    echo $users[0][0];
} else {
    print('Error : no_argument');
}
