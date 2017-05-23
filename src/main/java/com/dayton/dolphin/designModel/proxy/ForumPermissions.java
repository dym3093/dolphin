package com.dayton.dolphin.designModel.proxy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by bruce on 17-5-23.
 */
public enum ForumPermissions {

    READ(0, "Permission to read object."),
    SYSTEM_ADMIN(1, "Permission to administer the entire system."),
    FORUM_ADMIN(2, "Permission to administer a particular forum."),
    USER_ADMIN(3, "Permission to administer a particular user."),
    GROUP_ADMIN(4, "Permission to administer a particular group."),
    MODERATE_THREADS(5, "Permission to moderate threads."),
    CREATE_THREAD(6, "Permission to create a new thread."),
    CREATE_MESSAGE(7, "Permission to create a new message."),
    MODERATE_MESSAGES(8, "Permission to moderate messages.");

    //枚举值为键的对象集
    private static final Map<Integer,ForumPermissions> valMap =
            new ConcurrentHashMap<Integer,ForumPermissions>();
    //枚举说明为键的对象集
	private static final Map<String,ForumPermissions> hintMap =
            new ConcurrentHashMap<String,ForumPermissions>();
	//以枚举名称对应的字符串为键的对象集
	private static final Map<String,ForumPermissions> stringToEnum =
            new ConcurrentHashMap<String,ForumPermissions>();

	static {
		if(values()!=null){
			for(ForumPermissions obj: values()){
				valMap.put(obj.getVal(), obj);
				hintMap.put(obj.getHint(), obj);
				stringToEnum.put(obj.toString(), obj);
			}
		}
	}


	//枚举值
    private final Integer val;
	//枚举说明
    private final String hint;

    ForumPermissions(Integer val, String hint){
        this.val = val;
        this.hint = hint;
    }

    public Integer getVal() {
        return val;
    }

    public String getHint() {
        return hint;
    }

    //是否为许可值
    public boolean isPermitVal(Integer permVal){
        return valMap.get(permVal)!=null;
    }

    public boolean isSystemOrForumAdmin(Integer permVal){
        return permVal==FORUM_ADMIN.getVal()||
               permVal==SYSTEM_ADMIN.getVal();
    }

    public static void main(String[] args){

    }

}
