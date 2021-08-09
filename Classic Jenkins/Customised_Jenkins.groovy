import jenkins.model.*
import java.util.logging.Logger

Logger logger = Logger.getlogger("")

logger.info "Executing Init Script"

Jenkins.instance.setDisableRememberMe(true)
Jenkins.instance.setSystemMessage('<h1> You Have Logged Onto ESD PROD Jenkins Server</h1>')
Jenkins.instance.save()

logger.info "Init Script Complete"