@Library('add-ons-shared-libs@develop') _

node {
    echo "test"
    continuousIntegrationPipeline(
        buildType: 'deploy',
        sonar: [
            enable: true,
            projectKey: "eclipse-kura_kura-bluetooth",
            tokenId: "sonarcloud-token-kura-bluetooth",
            exclusions: "tests/**/*.java"
        ],
    )
}
