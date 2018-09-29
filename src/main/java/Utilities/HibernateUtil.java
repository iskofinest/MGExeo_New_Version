package Utilities;

import ConstantHandlers.ConstantHandler;
import Services.JSONService;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.jboss.logging.Logger;
import org.json.simple.JSONObject;

public class HibernateUtil {
    
    private static SessionFactory SESSION_FACTORY;
    
//    static {
//        
//        
//        try {
////            JSONObject jsonConfigFile = JSONService.getJSONFile();
////            Properties properties = new Properties();
////            properties.setProperty("hibernate.connection.url", String.valueOf(jsonConfigFile.get("hibernate.connection.url")));
////            properties.setProperty("hibernate.connection.username", String.valueOf(jsonConfigFile.get("hibernate.connection.username")));
////            properties.setProperty("hibernate.connection.password", String.valueOf(jsonConfigFile.get("hibernate.connection.password")));
//            
//            Configuration configuration = new Configuration().configure(); // configuration // settings // from // hibernate.cfg.xml
////            configuration.setProperties(properties);
//            StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
//            serviceRegistryBuilder.applySettings(configuration.getProperties());
//            ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
//            SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);
//        } catch (Throwable ex) {
//            // Log the exception. 
//            System.err.println("Initial SessionFactory creation failed." + ex);
//            javax.swing.JOptionPane.showMessageDialog(null, ex.toString(), "ERROR", 0);
////            JSONService.setJSONFile();
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
    
//    public static SessionFactory getSessionFactory() {
//        try {
////            JSONObject jsonConfigFile = JSONService.getJSONFile();
////            Properties properties = new Properties();
////            properties.setProperty("hibernate.connection.url", String.valueOf(jsonConfigFile.get("hibernate.connection.url")));
////            properties.setProperty("hibernate.connection.username", String.valueOf(jsonConfigFile.get("hibernate.connection.username")));
////            properties.setProperty("hibernate.connection.password", String.valueOf(jsonConfigFile.get("hibernate.connection.password")));
//            
//            Configuration configuration = new Configuration().configure(); // configuration // settings // from // hibernate.cfg.xml
////            configuration.setProperties(properties);
//            StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
//            serviceRegistryBuilder.applySettings(configuration.getProperties());
//            ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
//            SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);
//            return SESSION_FACTORY;
//        } catch (Throwable ex) {
//            // Log the exception. 
//            System.err.println("Initial SessionFactory creation failed." + ex);
//            javax.swing.JOptionPane.showMessageDialog(null, ConstantHandler.DISCONNECTED_MESSAGE, "ERROR", 0);
////            JSONService.setJSONFile();
//            throw new ExceptionInInitializerError(ex);
//        }
////        return SESSION_FACTORY;
//    }
    
    private static SessionFactory sessionFactory;
    public static final Logger logger = Logger.getLogger(HibernateUtil.class.getName());
    
    static {
        
        
        try {
            JSONObject jsonConfigFile = JSONService.getJSONFile();
            Properties properties = new Properties();
            properties.setProperty("hibernate.connection.url", String.valueOf(jsonConfigFile.get("hibernate.connection.url")));
            properties.setProperty("hibernate.connection.username", String.valueOf(jsonConfigFile.get("hibernate.connection.username")));
            properties.setProperty("hibernate.connection.password", String.valueOf(jsonConfigFile.get("hibernate.connection.password")));
            
            Configuration configuration = new Configuration().configure(); // configuration // settings // from // hibernate.cfg.xml
            configuration.setProperties(properties);
            StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
            serviceRegistryBuilder.applySettings(configuration.getProperties());
            ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Can't Connect into database.", "ERROR", 0);
            JSONService.setJSONFile();
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        logger.logf(Logger.Level.FATAL,sessionFactory.getStatistics().toString());
        return sessionFactory;
    }
    
}
