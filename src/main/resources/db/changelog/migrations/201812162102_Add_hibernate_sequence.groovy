package db.changelog.migrations

databaseChangeLog {
    changeSet(id: '201812162102_Add_hibernate_sequence', author: 'Desmond Letshedi') {
        createSequence(sequenceName: 'hibernate_sequence')
    }
}