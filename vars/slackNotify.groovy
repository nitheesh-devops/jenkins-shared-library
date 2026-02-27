def call(Map config = [:]) {

    // Default values
    String channel = config.get('channel', '#devops')
    String color   = config.get('color', '#439FE0')
    String message = config.get('message', 'No message provided')
    String status  = config.get('status', 'INFO')

    slackSend(
        channel: channel,
        color: color,
        message: """\
*Job*: ${env.JOB_NAME}
*Build*: #${env.BUILD_NUMBER}
*Status*: ${status}
*Message*: ${message}
*URL*: ${env.BUILD_URL}
"""
    )
}
