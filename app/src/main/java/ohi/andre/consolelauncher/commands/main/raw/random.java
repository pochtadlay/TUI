package ohi.andre.consolelauncher.commands.main.raw;


import android.os.Build;

import java.lang.Math.*;
import ohi.andre.consolelauncher.R;
import ohi.andre.consolelauncher.commands.CommandAbstraction;
import ohi.andre.consolelauncher.commands.ExecutePack;
import ohi.andre.consolelauncher.commands.main.specific.APICommand;


public class random implements APICommand, CommandAbstraction {



    @Override
    public String exec(final ExecutePack pack) throws Exception {
        int a = (int) (Math.random()*100);
        String str = Integer. toString(a);
        return str;
    }

    @Override
    public int[] argType() {
        return new int[0];
    }

    @Override
    public int priority() {
        return 3;
    }

    @Override
    public int helpRes() {return R.string.help_random;}

    @Override
    public String onArgNotFound(ExecutePack pack, int indexNotFound) {
        return null;
    }

    @Override
    public String onNotArgEnough(ExecutePack pack, int nArgs) {
        return null;
    }

    @Override
    public boolean willWorkOn(int api) {
        return api >= Build.VERSION_CODES.GINGERBREAD;
    }
}