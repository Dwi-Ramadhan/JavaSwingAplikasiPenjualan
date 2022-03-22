<?php
require_once('../connect_to_db.php');

$result;
if (isset($_REQUEST['id_user'])) {
    $result = $conn->query("SELECT id_user,nama,password FROM user WHERE id_user='{$_REQUEST['id_user']}';");
} else {
    $result = $conn->query('SELECT id_user,nama,password FROM user;');
}

if ($conn->error) {
    die('Error: ' . $conn->error);
}

$datas = (array) $result->fetch_all(MYSQLI_ASSOC);
//encode datas to string with my own defined format
$datasAsString = 'Datas:';
for ($i = 0; $i < count($datas); ++$i) {
    $datasAsString .= <<<D
    {$datas[$i]['id_user']},{$datas[$i]['nama']},{$datas[$i]['password']};
    D;
}
echo $datasAsString;
