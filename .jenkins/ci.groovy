@Library('add-ons-shared-libs@develop') _

node {
    continuousIntegrationPipeline(
        echo "hello"
        buildType: 'deploy',
        sonar: [
            enable: true,
            projectKey: "eclipse-kura_kura-bluetooth",
            tokenId: "sonarcloud-token-kura-bluetooth",
            exclusions: "tests/**/*.java"
        ],
    )
}
