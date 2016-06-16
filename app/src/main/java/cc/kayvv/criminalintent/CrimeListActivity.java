package cc.kayvv.criminalintent;

import android.app.Fragment;

/**
 * Created by Kay on 29/05/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
