Nama        : Dwi Ramadhan Rivaldo
Contact     : 089512758207 (WA/Telp)
              dwirivaldo51@smk.belajar.id (email)

Deskripsi Program:
 Aplikasi Penjualan ini saya buat menggunakan Bahasa
 pemrograman Java, Swing Framework, dan Netbeans IDE.
 Sedangkan Middlware yang menyediakan fungsi untuk 
 mengatur database, saya buat menggunakan PHP.
 Untuk Database sendiri saya mengunakan MySQL.
 Struktur database untuk aplikasi ini dapat dilihat di
 file "databaseChart.jpg".

         Software Java -> Middleware -> Database

 Aplikasi ini tidak mengubah data di database secara
 langsung, tapi melalui Middleware yang menyediakan berbagai
 fungsi yang diperlukan. Aplikasi terhubung dengan Middleware
 menggunakan HTTP protocol. Hal ini membuat batasan yang
 jelas antara Software dengan GUI yang berinteraksi
 langsung dengan User dan Backend yang berisi Logika
 Program dan Memanipulasi Data.
 Sehingga untuk menjalankan aplikasi ini, terlebih dahulu
 harus "meng-host" Middleware ini di "http://localhost:5050" 
 agar dapat diakses oleh Aplikasi melalui HTTP connection. 

Fitur Aplikasi ini diantaranya
- Login
   Mengunakan nama & password yg ada pd table 'user' di DB
   Salah satunya : nama = "Dwi Ramadhan", password = "drr"
- Logout
   Dengan men-klik menu item 'Keluar' pd menu 'Data Master'
   maka program akan mengarahkan kembali ke halaman Login.
   Anda dapat mencoba login dengan nama & password berbeda
   selama data itu ada di table 'user' di DB atau di halaman
   menu 'Data User'. Data user yg login akan disimpan di tiap
   sesi dan transaksi akan diasosiakan dengan user yg login 
   pada sesi tersebut.
- Menambah, Mengedit, dan Menghapus Data User
   User yang ditambah harus unique.
- Menambah, Mengedit, dan Menghapus Data Barang
   Barang yang ditambah harus unique.
- Kasir
   Memilih barang-barang yg akan dibeli dan jumlah masing-masing
   dan program akan otamatis menghitung total harga.
   Klik 'simpan' untuk menyimpan data transaksi, dan program
   akan otamatis mengupdate stok barang yang telah dibeli.
- Laporan Penjualan
   Menampilkan data trasaksi-transaksi yg pernah dilakukan
   meliputi nama pembeli, tanggal, barang-barang yg dibeli
   dan jumah masing-masing, serta total harga.

Cara menjalankan Aplikasi:
 1. Import file 'penjualan_barang.sql' ke DB MySQL
 2. "Host" Middleware dgn alamat 'http://localhost:5050'
     
     Path Middleware : 'AplikasiPenjualan\src\aplikasipenjualan\ServerSide\'.
     Saya biasanya mengunakan PHP local server untuk menghostnya
     -> 'path-to-php/php.exe -S localhost:5050 path_to_middleware'.

 3. Sesuaikan konfigurasi koneksi ke database di file
    'path_to_middleware/connect_to_db.php"

    Default : user = 'root'
	      password = 'root'
              database = 'penjualan_barang'
    Tapi anda dapat mengubah ini sesuai dengan konfigurasi
    Database anda, misalnya mengganti user dan passwordnya.

 4. Buka foler 'AplikasiPenjualan/' di Netbeans IDE dan
    jalankan aplikasi dengan klik tombaol 'Run' di Netbeans IDE.
    Anda dapat melihat log program pada panel 'Output' di Netbeans IDE
    untuk melihat pesan yg saya buat mengenai alur proses dan 
    pesan error bila terjadi error.