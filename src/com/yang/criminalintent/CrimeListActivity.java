package com.yang.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity {

	@Override
	protected Fragment creatFragment() {
		// TODO Auto-generated method stub
		return new CrimeListFragment();
	}

}
