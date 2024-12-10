package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {

    val doc: Document = Jsoup.connect(
        "https://mybook.ru/author/duglas-adams/" +
                "avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
    ).get()

    val newsHeadlines: Elements = doc.select("article")

    for (headLine: Element in newsHeadlines) {
        println("${headLine.id("article").text()}\n")

    }
}