package AplikasiPenjualan.ServerAPI;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class ServerAPI {
    
    public static String executePost(String targetURL, String urlParameters) {
        HttpURLConnection connection = null;

        try {
            //Create connection
            connection = (HttpURLConnection) new URL(targetURL).openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            //Send request
            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.close();

            //Get Response 
            BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
            }
            rd.close();
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
    
    public static boolean login_authentication(String nama, String pswd){
        System.out.print("\nauthenticating user...");
        
        String res = executePost("http://[::1]:5050/user/login.php", "nama="+nama+"&pswd="+pswd);
        System.out.print(res);
        if(res.equals("authenticated")){
            return true;
        }else{
            return false;
        }
    }
    
    public static int getIdUser(String nama, String pswd){
        System.out.print("\ngetting idUser..");
        String res = executePost("http://[::1]:5050/user/getId.php", "nama="+nama+"&pswd="+pswd);
        System.out.print(res);
        int id = Integer.parseInt(res);
        return id;
    }
    
   public static ArrayList<String[]> get_data_barang(){
       System.out.print("\ngetting data barang from DB...");
       
       ArrayList<String[]> data = new ArrayList<String[]>();
       String res = executePost("http://[::1]:5050/barang/get.php", "");
       
       String[] result = res.split(":");
       if(result[0].equals("Error")){
           System.out.print("\nError: "+result[1]);
       }else if(result[0].equals("Datas")){
           System.out.print("Berhasil");
           //decode data
           for(String row : result[1].split(";")){
               data.add(row.split(","));
           }
       }
       return data;
   }
   
   public static String[] get_data_barang(String id_barang){
       System.out.print("\ngetting data barang dengan id_barang "+id_barang+" from DB...");
       
       ArrayList<String[]> data = new ArrayList<String[]>();
       String res = executePost("http://[::1]:5050/barang/get.php", "id_barang="+id_barang);
       
       String[] result = res.split(":");
       if(result[0].equals("Error")){
           System.out.print("\nError: "+result[1]);
       }else if(result[0].equals("Datas")){
           System.out.print("Berhasil");
           //decode data
           for(String row : result[1].split(";")){
               data.add(row.split(","));
           }
       }
       if(data.isEmpty()){
           return new String[0];
       }
       return data.get(0);
   }

   public static boolean add_data_barang(String id_barang, String nama, String harga, String stok){
       System.out.print("\ntambah data barang ke DB...");
       String res = executePost("http://[::1]:5050/barang/add.php","id_barang="+id_barang+"&nama="+nama+"&harga="+harga+"&stok="+stok);
       
       System.out.print(res);
       if(res.equals("added")){
           return true;
       }
       return false;
   }
   
   public static boolean edit_data_barang(String id_barang_lama, String id_barang, String nama, String harga, String stok){
       System.out.print("\nedit data barang di DB...");
       String res = executePost("http://[::1]:5050/barang/edit.php","id_barang_lama="+id_barang_lama+"&id_barang="+id_barang+"&nama="+nama+"&harga="+harga+"&stok="+stok);
       
       System.out.print(res);
       if(res.equals("edited")){
           return true;
       }
       return false;
   }
   
   public static boolean delete_data_barang(String id_barang){
       System.out.print("\ndelete data barang di DB...");
       String res = ServerAPI.executePost("http://[::1]:5050/barang/delete.php", "id_barang="+id_barang);
       
       System.out.print(res);
       if(res.equals("deleted")){
           return true;
       }
       return false;
   }
   
   public static ArrayList<String[]> get_data_user(){
       System.out.print("\ngetting data user from DB...");
       
       ArrayList<String[]> data = new ArrayList<String[]>();
       String res = executePost("http://[::1]:5050/user/get.php", "");
       
       String[] result = res.split(":");
       if(result[0].equals("Error")){
           System.out.print("\nError: "+result[1]);
       }else if(result[0].equals("Datas")){
           System.out.print("Berhasil");
           //decode data
           for(String row : result[1].split(";")){
               data.add(row.split(","));
           }
       }
       return data;
   }
   
   public static String[] get_data_user(String id_user){
       System.out.print("\ngetting data user dengan id_user "+id_user+" from DB...");
       
       ArrayList<String[]> data = new ArrayList<String[]>();
       String res = executePost("http://[::1]:5050/user/get.php", "id_user="+id_user);
       
       String[] result = res.split(":");
       if(result[0].equals("Error")){
           System.out.print("\nError: "+result[1]);
       }else if(result[0].equals("Datas")){
           System.out.print("Berhasil");
           //decode data
           for(String row : result[1].split(";")){
               data.add(row.split(","));
           }
       }
       if(data.isEmpty()){
           return new String[0];
       }
       return data.get(0);
   }

   public static boolean add_data_user(String id_user, String nama, String password){
       System.out.print("\ntambah data user ke DB...");
       String res = executePost("http://[::1]:5050/user/add.php","id_user="+id_user+"&nama="+nama+"&password="+password);
       
       System.out.print(res);
       if(res.equals("added")){
           return true;
       }
       return false;
   }
   
   public static boolean edit_data_user(String id_user_lama, String id_user, String nama, String password){
       System.out.print("\nedit data user di DB...");
       String res = executePost("http://[::1]:5050/user/edit.php","id_user_lama="+id_user_lama+"&id_user="+id_user+"&nama="+nama+"&password="+password);
       
       System.out.print(res);
       if(res.equals("edited")){
           return true;
       }
       return false;
   }
   
   public static boolean delete_data_user(String id_user){
       System.out.print("\ndelete data user di DB...");
       String res = ServerAPI.executePost("http://[::1]:5050/user/delete.php", "id_user="+id_user);
       
       System.out.print(res);
       if(res.equals("deleted")){
           return true;
       }
       return false;
   }
   
   public static ArrayList<ArrayList<String>> get_data_laporan(){
       System.out.print("\ngetting data laporan from DB...");
    
       ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
       String res = executePost("http://[::1]:5050/laporan/get.php", "");
       
       String[] result = res.split(":");
       if(result[0].equals("Error")){
           System.out.print("\n"+res);
       }else if(result[0].equals("Datas")){
           System.out.print("Berhasil\t");
           //decode data
           for(String row : result[1].split(";")){
               ArrayList<String> dataRow = new ArrayList<String>();
               for(String col : row.split(",")){
                   dataRow.add(col);
               }
               int lastIndex = dataRow.size()-1;
               
               //convert detail barang to ArrayList
//               ArrayList<ArrayList<String>> detail = new ArrayList<ArrayList<String>>();
//               for(String detail_row : ((String)data.get(lastIndex)).split("#")){
//                   ArrayList<String> detail_columns = new ArrayList<String>();
//                   for(String d : detail_row.split("%")){
//                       detail_columns.add(d);
//                   }
//                   detail.add(detail_columns);
//               }
//               data.set(lastIndex, detail);
                
                //convert detail barang to String
                String detail = "";
                for(String detail_row : ((String)dataRow.get(lastIndex)).split("#")){
                    String[] d = detail_row.split("%");
                    if(d.length == 2){
                        detail += String.format("%-20s", d[0]) + String.format("%-5s", d[1]);
                    }
                }
                dataRow.set(lastIndex, detail);
                data.add(dataRow);
           }
       }
       return data;
   }
   
   public static boolean simpan_data_transaksi(String idUser, String tanggal, String total, String[][] barang){
       System.out.print("\nMenyimpan data transaksi ke DB...");
       
       //encode data barang
       String barangAsString = "";
       for(int i=0; i<barang.length; ++i){
           barangAsString += barang[i][0] + "%" + barang[i][1];
           if(i != barang.length-1){
               barangAsString += ";";
           }
       }
       
       String res = executePost("http://[::1]:5050/penjualan/transaksi.php","id_user="+idUser+"&tanggal="+tanggal+"&total="+total+"&barang="+barangAsString);
       if(res.equals("success")){
           System.out.print(res+"\n");
           return true;
       }
       System.out.print("\n"+res);
       return false;
   }
   
   public static void main(String[] args){
       ArrayList<String[]> data = get_data_barang();
       for(String[] row : data){
           System.out.print("\n");
           for(String col : row){
               System.out.print(col + "\t");
          }
       }
   }
}
