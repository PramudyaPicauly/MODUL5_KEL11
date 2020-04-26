package MODUL5_KEL11;

public class userService {
    private String[][] data = new String[2][3];
    private String[][] histories = new String[2][4];
    private String email, password, roles,  matkul1, matkul2, tanggal, useremail = "";
    
    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"pramudyaanggarap_kelompok11@gmail.com", "130061", "PRAKTIKAN_1"},
            {"fajarrahmanar_kelompok11@gmail.com", "140126", "PRAKTIKAN_2"} 
        };
        String[][] histories = 
        {
            {"pramudyaanggarap_kelompok11@gmail.com", "Fisika Dasar", "Dasar Komputer dan Pemrograman", "26-04-2020"},
            {"fajarrahmanar_kelompok11@gmail.com", "Dasar Komputer dan Pemrograman", "Konsep Jaringan Komputer", "26-04-2020"}
        };
        this.data = data;
        this.histories = histories;
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    roles = data[i][2];
                    matkul1 = histories[i][1];
                    matkul2 = histories[i][2];
                    tanggal = histories[i][3];
                    
                    return true;
                }
            }
        }
        return false;
    }
  
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
            System.out.println(""+ matkul1);
            System.out.println("" + matkul2);
            System.out.println("Tanggal Peminjaman = " + tanggal);
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }
}

