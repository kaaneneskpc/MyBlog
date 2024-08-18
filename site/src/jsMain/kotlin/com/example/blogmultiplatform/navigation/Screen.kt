package com.example.blogmultiplatform.navigation

sealed class Screen(val route: String) {
    object AdminHome : Screen(route = "/admin")
    object AdminLogin : Screen(route = "/admin/login")
    object HomePage : Screen(route = "/")

    object AdminCreate : Screen(route = "/admin/create")

    object AdminMyPosts : Screen(route = "/admin/myposts")
    object AdminSuccess : Screen(route = "/admin/success")
    /* object AdminCreate : Screen(route = "/admin/create") {
        fun passPostId(id: String) = "/admin/create?${POST_ID_PARAM}=$id"
    }

    object AdminMyPosts : Screen(route = "/admin/myposts") {
        fun searchByTitle(query: String) = "/admin/myposts?${QUERY_PARAM}=$query"
    }

    object AdminSuccess : Screen(route = "/admin/success") {
        fun postUpdated() = "/admin/success?${UPDATED_PARAM}=true"
    }

    object HomePage : Screen(route = "/")
    object SearchPage : Screen(route = "/search/query") {
        fun searchByCategory(category: Category) =
            "/search/query?${CATEGORY_PARAM}=${category.name}"

        fun searchByTitle(query: String) = "/search/query?${QUERY_PARAM}=$query"
    }

    object PostPage : Screen(route = "/posts/post") {
        fun getPost(id: String) = "/posts/post?${POST_ID_PARAM}=$id"
    } */
}