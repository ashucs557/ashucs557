package com.java64bit.repository;

import java.util.List;
import com.java64bit.model.Login;
public interface LoginRepository {
List<Login> getLoginFromDb();
String createLogin(Login login);
}
