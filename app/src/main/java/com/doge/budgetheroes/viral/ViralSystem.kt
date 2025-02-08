class ViralSystem {
    val memeGenerator = MemeGenerator(
        templates = listOf(
            "distracted-boyfriend.jpg",
            "drake-hotline-bling.jpg",
            "doge-much-waste.jpg"
        ),
        aiCaptionGeneration = true
    )

    val twitterBot = TwitterBot(
        autoPost = true,
        triggers = listOf(
            "Player saved $1B+",
            "Found ridiculous government expense",
            "Discovered new waste category"
        ),
        hashTags = listOf("#DOGEheroes", "#TaxpayerMoney", "#GovernmentWaste")
    )

    val realWorldTie = RealWorldConnection(
        congressionalDataAPI = true,
        usaspending = true,
        federalReserveData = true
    )
} 