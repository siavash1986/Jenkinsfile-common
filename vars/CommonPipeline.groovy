void call(Map params = [:] ){

}

void build(Map<String, Object> params){
    def defaults = [
            projectVersion : null
    ]

    def config = defaults + params
    echo config.toString()
    command """
            gradle -Pversion=$config.projectVersion build
            """
}