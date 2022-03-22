<?php
include_once '../connect_to_db.php';

if (isset($_REQUEST['nama']) && isset($_REQUEST['pswd'])) {
    $result = $conn->query("SELECT nama,password FROM user;");
    $users = $result->fetch_all(MYSQLI_ASSOC);
    $users_count = count($users);

    //checking occurances for each row in table user
    for ($i = 0; $i < $users_count; ++$i) {
        if ($_REQUEST['nama'] == $users[$i]['nama'] && $_REQUEST['pswd'] == $users[$i]['password']) {
            print('authenticated');
            break;
        } else if ($i == $users_count - 1) {
            //if there is no occurance
            print('Error: authentication_failed');
        }
    }
} else {
    print('Error : no_argument');
}
