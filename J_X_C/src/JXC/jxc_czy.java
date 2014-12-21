package JXC;
import java.awt.List;
import java.util.*;

import means.dushuju_czy;

import User.Operator;
import User.User;

public class jxc_czy {
	static ArrayList userList=new ArrayList();
          
          public void add(Operator op){
        	  userList.add(op);
          }
          public void removeUser(Operator op){
        	  userList.remove(op);
          }
          
           public Operator getOperatorbydlmc(String dlmc){
        	   Operator op=new Operator(dlmc);
        	   int index=userList.indexOf(op);
        	   if (index==-1) {
       			           return null;
       		}
       		return (Operator)userList .get(index);
           }
           
           public boolean judge(String dlmc,String mm){
        	   Operator op=this.getOperatorbydlmc(dlmc);
        	   if(op==null){
        		   return false; 
        	   }
        	   if(!op.getMm().equals(mm)){
        		   return false;
        	   }
        	   return true;
           }
           public void showAllUser(){
        	  for (int i = 0; i < userList.size(); i++) {
        		  System.out.println("µÇÂ¼Ãû³Æ"+(i+1)+":"+userList.get(i));
			}
           }
           public ArrayList getAllUser(){
        	   return this.userList;
            }
//           public static void main(String[] args) {
//        	   dushuju_czy s=new dushuju_czy();
//        	   s.dushuju();
//        	  jxc_czy m= new jxc_czy();
//        	  m.showAllUser();
//		}
		public Operator findOperatorByNameAndpwd(String dlmc, String mm) {

			Operator user=this.getOperatorbydlmc(dlmc);
     	   if(user==null){
     		   return null; 
     	   }
     	   if(!user.getMm().equals(mm)){
     		   return null;
     	   }
     	   return user;
		}
}

