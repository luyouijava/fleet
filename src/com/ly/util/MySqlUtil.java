package com.ly.util;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MySqlUtil
{
    //定义变量
    private static Connection ct = null;
    //大多数情况下用preparedstatement替代statement
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
   
    //连接数据库的参数
    private static String url = "";
    private static String username = "";
    private static String driver = "";
    private static String passwd = "";
   
    private static CallableStatement cs = null;
    public static CallableStatement getCs()
    {
        return cs;
    }

    //得到连接
    public static Connection getConnection()
        {
            try{
            	ct = MyConnection.getConnection();
            }
            catch(Exception e) {e.printStackTrace();}
            return ct;
        }
   
//*************callPro1存储过程函数1*************   
    public static CallableStatement callPro1(String sql,String[] parameters)
    {
        try{
            ct = getConnection();
            cs = ct.prepareCall(sql);
            if(parameters!=null){
                for(int i=0;i<parameters.length;i++){
                 cs.setObject(i+1,parameters[i]);
                }
            }   
            cs.execute();
        }
        catch(Exception e) { e.printStackTrace(); throw new RuntimeException(e.getMessage());}
        finally
        { close(rs,cs,ct);}
        return cs;
    }
   
    public static ResultSet executeQuery(String sql,String[] parameters)
    {
        try
        {
            ct=getConnection();
            ps=ct.prepareStatement(sql);
            if(parameters!=null)
            {
                for(int i=0;i<parameters.length;i++)
                {
                    ps.setString(i+1,parameters[i]);
                }
            }
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        finally
        {
           //close(rs, ps, ct);
        }
        return rs;
    }
   
   
    public static Connection getCt()
    {
        return ct;
    }
    public static PreparedStatement getPs()
    {
        return ps;
    }
    public static ResultSet getRs()
    {
        return rs;
    }
   
   
    public static void executeUpdate2(String[] sql,String[][] parameters)
    {
        try
        {
            ct = getConnection();
            ct.setAutoCommit(false);
           
            for(int i=0;i<sql.length;i++)
            {
               
                if(null!=parameters[i])
                {
                    ps = ct.prepareStatement(sql[i]);
                    for(int j=0;j<parameters[i].length;j++)
                    {
                        ps.setString(j+1,parameters[i][j]);
                    }
                    ps.executeUpdate();
                }
               
            }
           
           
            ct.commit();
           
           
        }catch (Exception e)
        {
            e.printStackTrace();
            try
            {
                ct.rollback();
            }
            catch (SQLException e1)
            {
                e1.printStackTrace();
            }
            throw  new RuntimeException(e.getMessage());
        }finally
        {
            close(rs,ps,ct);
        }
       
    }
   
    //先写一个update、delete、insert
    //sql格式：update 表名 set 字段名 =？where 字段=？
    //parameter神应该是（”abc“,23）
    public static void executeUpdate(String sql,String[] parameters)
    {
        try
        {
            ct=getConnection();
            ps = ct.prepareStatement(sql);
            if(parameters!=null)
            {
                for(int i=0;i<parameters.length;i++)
                {
                    ps.setString(i+1,parameters[i]);
                }
                           
            }
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();//开发阶段
            //抛出异常
            //可以处理，也可以不处理
            throw new RuntimeException(e.getMessage());
        }
        finally
        {
            close(rs,ps,ct);
        }
    }
   
    public static void close(ResultSet rs,Statement ps,Connection ct)
    {
        //关闭资源(先开后关)
        if(rs!=null)
        {
            try
            {
                rs.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            rs=null;
        }
        if(ps!=null)
        {
            try
            {
                ps.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            ps=null;
        }
        if(null!=ct)
        {
            try
            {
                ct.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            ct=null;
        }
    }
}
