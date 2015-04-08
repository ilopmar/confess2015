// Execute with:
// gradle build
// groovy -cp build/libs/add-version-1.0.jar LocalASTExample.groovy

import confess2015.Version

@Version('1.0')
class VersionedClass {
}

println VersionedClass.VERSION