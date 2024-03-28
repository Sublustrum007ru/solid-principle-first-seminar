package homework;

import homework.util.impl.UserOperation;

public class Persister{
  private final UserOperation userOperation = new UserOperation();


    public void save (User user){
      userOperation.save(user);
  }

  public void report(User user){
        userOperation.report(user);
  }
}
