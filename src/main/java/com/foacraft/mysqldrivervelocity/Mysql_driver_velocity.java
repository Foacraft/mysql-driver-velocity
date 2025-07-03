package com.foacraft.mysqldrivervelocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

import java.sql.DriverManager;
import java.sql.SQLException;

@Plugin(
        id = "mysqldrivervelocity",
        name = "mysql-driver-velocity",
        version = BuildConstants.VERSION
)
public class Mysql_driver_velocity {

    static {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
    }
}
