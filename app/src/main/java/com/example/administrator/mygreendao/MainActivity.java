package com.example.administrator.mygreendao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText ed1, ed2;
    Button bt1, bt2, bt3, bt4;
    UserDao userDao;
    Long _id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userDao = GreenDaoHelper.getDaoSession().getUserDao();
        init();
        Log.e("User", " 嘿嘿 再一次测试==>");
        //嘿嘿，我要拉去了
    }

    private void init() {
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        bt1 = (Button) findViewById(R.id.button);
        bt2 = (Button) findViewById(R.id.button2);
        bt3 = (Button) findViewById(R.id.button3);
        bt4 = (Button) findViewById(R.id.button4);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                User user = new User();
                user.setNickname(ed2.getText().toString());
                user.setUsername(ed1.getText().toString());
                userDao.insertOrReplace(user);
                break;
            case R.id.button2:

                userDao.deleteByKey(_id);
                break;
            case R.id.button3:
                User user1 = new User();
                user1.set_id(_id);
                user1.setNum("HHH");
                user1.setNickname(ed2.getText().toString());
                user1.setUsername(ed1.getText().toString());
                userDao.update(user1);
                break;
            case R.id.button4:
                User usera = userDao.queryBuilder().where(UserDao.Properties._id.eq(ed1.getText().toString())).unique();
                if (usera != null)
                    _id = usera.get_id();
                Log.e("User", "查询全部数据==>" + usera.getUsername() + usera.getNickname() + usera.getNum());
                break;
        }
    }
}
