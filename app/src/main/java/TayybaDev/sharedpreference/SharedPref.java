package TayybaDev.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {
    Context context;
    SharedPreferences sharedPreferences;

    public SharedPref(Context context) {
        this.context = context;
        sharedPreferences=context.getSharedPreferences("file",Context.MODE_PRIVATE);

    }
    public void insertData(String email,String pass)
    {
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("email",email);
        editor.putString("password",pass);
        editor.commit();

    }

    public String displayData(){

        String fileData=sharedPreferences.getString("email","no email")+ "\n"+sharedPreferences.getString("password","no password");

        return fileData;

    }


}
