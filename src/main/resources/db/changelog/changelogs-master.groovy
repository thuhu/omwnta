package db.changelog

databaseChangeLog {
    include(file: 'migrations/201812162102_Add_hibernate_sequence.groovy', relativeToChangelogFile: true)
    include(file: 'migrations/20190221_TestTable.groovy', relativeToChangelogFile: true)
}