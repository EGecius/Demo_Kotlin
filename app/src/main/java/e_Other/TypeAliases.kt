package e_Other

import java.io.File
import java.util.*


typealias FileTable<K> = MutableMap<K, MutableList<File>>

class TypeAliases {

    fun demo() {

        val map1 :MutableMap<String, MutableList<File>> = Collections.emptyMap()
        map1.clear()

        val map2 :FileTable<String> = Collections.emptyMap()
        map2.clear()

    }
}
