package db.changelog.migrations

databaseChangeLog {
    changeSet(id: '2018071636_Add_Message', author: 'Desmond Letshedi') {
        createSequence(sequenceName: 'message_id_sequence')

        createTable(tableName: 'message') {
            column(name: 'id', type: 'BIGINT') {
                constraints(nullable: false)
            }
            column(name: 'author', type: 'VARCHAR(100)') {
                constraints(nullable: false)
            }
            column(name: 'content', type: 'VARCHAR(255)') {
                constraints(nullable: false)
            }
        }
        addPrimaryKey(columnNames: 'id', constraintName: 'pk_message_id', tableName: 'message')
    }
}