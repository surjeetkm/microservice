package com.c2p.bankapplication;

public interface UserDetailsInterface {
	public int open(String username,String password,double amount,String adderess,double phone);
    public String withdraw(int acno,String uname,String pwd,int amt);
    public String deposit(int acno,String uname,String pwd,int amt);
    public String transfer(int acno,String uname,String pwd,int tacno,int amt);
    public String close(int acno,String uname,String pass);  
    public String balance(int acno,String uname,String pass);
}
