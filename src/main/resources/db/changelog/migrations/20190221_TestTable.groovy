package db.changelog.migrations

databaseChangeLog {
    changeSet(id: '20190221_TestTable', author: 'Desmond Letshedi') {
        createSequence(sequenceName: 'message_id_sequence')

        createTable(tableName: 'message') {
            column(name: 'id', type: 'BIGINT') {
                constraints(nullable: false)
            }
            column(name: 'message', type: 'VARCHAR(100)') {
                constraints(nullable: false)
            }
        }
        addPrimaryKey(columnNames: 'id', constraintName: 'pk_message_id', tableName: 'message')
    }
}
