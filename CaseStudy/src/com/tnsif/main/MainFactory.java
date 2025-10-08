package com.tnsif.main;
import com.tnsif.application.GSNormalAcc;
import com.tnsif.application.GSPrimeAcc;
		public class MainFactory {
			public static void main(String[] args) {
				GSPrimeAcc gsprime = new GSPrimeAcc(401,"seetha",4500,true);
				GSNormalAcc gsnormal = new GSNormalAcc(402,"sanvi",6500,22.3f);
				gsprime.bookProduct(10.4f);
				gsnormal.bookProduct(22.3f);
	}
}