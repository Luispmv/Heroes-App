package com.example.heroesapp.models

data class CharacterItem(val id:Int, val name: String, val imagen:String){
    companion object{
        val characters = mutableListOf<CharacterItem>(
            CharacterItem(1,"Spiderman", "https://i.imgur.com/bHGENih.jpeg"),
            CharacterItem(2, "Iron Man", "https://i.imgur.com/5lDmUOa.jpeg"),
            CharacterItem(3,"Hulk", "https://i.imgur.com/RxSHhVL.jpeg"),
            CharacterItem(4,"Wolverine", "https://i.imgur.com/FPeZyaH.jpeg"),
            CharacterItem(5, "Thor","https://i.imgur.com/LxL54rn.jpeg"),
            CharacterItem(6, "Silver Surfer","https://i.imgur.com/yfa8gYu.jpeg"),
            CharacterItem(7, "Capitan America","https://i.imgur.com/UokjhNP.jpeg"),
            CharacterItem(8, "Deadpool","https://i.imgur.com/5jFnLgY.jpeg"),
            CharacterItem(9, "Thanos","https://i.imgur.com/gtxjCJb.jpeg"),
            CharacterItem(10, "Scarlet Witch","https://i.imgur.com/a9DAAXS.jpeg"),
            CharacterItem(11, "Superman","https://i.imgur.com/79kK4zI.jpeg"),
            CharacterItem(12, "Batman","https://i.imgur.com/mwSBHqs.jpeg"),
            CharacterItem(13, "Wonder woman","https://i.imgur.com/6qVHU2I.jpeg"),
            CharacterItem(14, "Green lantern","https://i.imgur.com/bdFc07l.jpeg"),
            CharacterItem(15, "Flash","https://i.imgur.com/svyjHkl.jpeg"),
            CharacterItem(16, "Green Arrow","https://i.imgur.com/40Km6au.jpeg"),
            CharacterItem(17, "Joker","https://i.imgur.com/3frR7xO.jpeg"),
            CharacterItem(18, "Lex Luthor","https://i.imgur.com/fay7sHc.jpeg"),
            CharacterItem(19, "Darkseid","https://i.imgur.com/GcgfX0w.jpeg"),
            CharacterItem(20, "Aquaman","https://i.imgur.com/VpNywAM.jpeg"),
            )
    }
}
