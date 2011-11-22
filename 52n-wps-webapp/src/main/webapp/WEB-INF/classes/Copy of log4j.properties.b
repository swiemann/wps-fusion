# Please rename that file to log4j.properties if you want to use it in the wps webapp. 

# Set root logger level to DEBUG and its only appender to A1.
log4j.rootLogger=INFO,A1

# A1 is set to be a FileAppender.
log4j.appender.A1=org.apache.log4j.FileAppender
log4j.appender.A1.File=${catalina.home}/logs/wps.html

# A1 uses PatternLayout.
log4j.appender.A1.layout=org.apache.log4j.HTMLLayout
log4j.appender.A1.layout.title=52n WPS logs.
log4j.appender.A1.layout.locationInfo=true

log4j.logger.org.n52.wps.server.WebProcessingService=WARN
log4j.logger.org.n52.wps.grid=INFO
log4j.logger.org.codehaus.xfire.aegis.type=ERROR
log4j.logger.org.apache.commons.digester=OFF
log4j.logger.org.apache.catalina=OFF
log4j.logger.org.apache.axis=OFF

log4j.logger.org.gridlab.gat.io.cpi.sftp=OFF
log4j.logger.com.terradue=DEBUG
log4j.logger.org.ogf.saga.adaptors.javaGAT.job=DEBUG