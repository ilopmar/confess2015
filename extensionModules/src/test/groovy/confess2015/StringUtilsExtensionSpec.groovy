package confess2015

import spock.lang.Specification

class StringUtilsExtensionSpec extends Specification {
    void 'test trucate'() {
        expect:
            "Lorem" == "Lorem ipsum".truncate(5)
            "Lorem..." == "Lorem ipsum".truncate(5, true)
    }
}