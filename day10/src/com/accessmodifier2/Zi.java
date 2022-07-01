package com.accessmodifier2;

import com.accessmodifier1.Fu;

/*public class Zi extends Fu {
	public void print() {
		System.out.println(i);
	}
}
*/

public class Zi {
	public void print() {
		Fu fu = new Fu();
		//System.out.println(fu.i);
	}
}
