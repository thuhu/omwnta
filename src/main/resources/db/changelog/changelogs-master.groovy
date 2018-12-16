package db.changelog

databaseChangeLog {
    include(file: 'migrations/201812071636_Add_Message.groovy', relativeToChangelogFile: true)
    include(file: 'migrations/201812161632_Add_Position_to_Message.groovy', relativeToChangelogFile: true)
    include(file: 'migrations/201812162102_Add_hibernate_sequence.groovy', relativeToChangelogFile: true)
}