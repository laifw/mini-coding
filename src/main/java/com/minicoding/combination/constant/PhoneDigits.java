package com.minicoding.combination.constant;

import java.util.HashMap;
import java.util.Map;

public interface PhoneDigits {

	public static final Map<Integer, String[]> phoneMap = new HashMap<Integer, String[]>() {{
		put(0, new String[] {"0"});
		put(1, new String[] {"1"});
		put(2, new String[] {"a","b","c"});
        put(3, new String[] {"d","e","f"});
        put(4, new String[] {"g","h","i"});
        put(5, new String[] {"j","k","l"});
        put(6, new String[] {"m","n","o"});
        put(7, new String[] {"p","q","r","s"});
        put(8, new String[] {"t","u","v"});
        put(9, new String[] {"w","x","y","z"});
    }};
    
}
