package db.changelog.migrations

databaseChangeLog {
    changeSet(id: '201812161632_Add_Position_to_Message', author: 'Desmond Letshedi') {
        addColumn(tableName: 'message') {
            column(name: 'altitude', type: 'FLOAT')
            column(name: 'longitude', type: 'FLOAT')
        }
    }
}