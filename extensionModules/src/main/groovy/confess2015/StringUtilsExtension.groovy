// src/main/groovy/confess2015/StringUtilsExtension.groovy
package confess2015
class StringUtilsExtension {
    static String truncate(String self, Integer length, Boolean overflow = false) {
        self.take(length) + (overflow ? '...' : '')
    }
}