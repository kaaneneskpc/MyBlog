My Blog
===========

**My Blog** is an Multiplatform App built entirely with Kotlin. It follows Android design and development best practices. 

The app is currently in development. There is no variant available in Play Store.

For the multiplatform (web) side, Kobweb API was used in the project. To put it briefly, Kobweb is an API that allows us to write a website using Kotlin.

# Features


## Screenshots


-------------------------------------------------------------------------------------------------------------

# Development Environment

**My Blog** uses the Gradle build system and can be imported directly into Android Studio (make sure you are using the latest stable version available [here](https://developer.android.com/studio)). 

The `debug` and `release` build variants can be built and run.

Once you're up and running, you can refer to the learning journeys below to get a better
understanding of which libraries and tools are being used, the reasoning behind the approaches to
UI, architecture and more, and how all of these different pieces of the project fit
together to create a complete app.

# Architecture

The **My Blog** app follows the **MVVM** (Model-View-ViewModel) architectural design pattern and **Clean Architecture** design pattern. 

![Architecture Diagram](https://github.com/kaaneneskpc/MyBlog/assets/32849662/1f7adab1-4c09-408e-b6c9-b4080c03dd19)


# Build

The app contains the usual `debug` and `release` build variants. 

# UI
The app was designed using [Material 3 guidelines](https://m3.material.io/).

The Screens and UI elements are built entirely using Jetpack Compose.

# KOBWEB

This is a [Kobweb](https://github.com/varabyte/kobweb) project bootstrapped with the `app/empty` template.

This template is useful if you already know what you're doing and just want a clean slate. By default, it
just creates a blank home page (which prints to the console so you can confirm it's working)

If you are still learning, consider instantiating the `app` template (or one of the examples) to see actual,
working projects.

## Getting Started

First, run the development server by typing the following command in a terminal under the `site` folder:

```bash
$ cd site
$ kobweb run
```

Open [http://localhost:8080](http://localhost:8080) with your browser to see the result.

You can use any editor you want for the project, but we recommend using **IntelliJ IDEA Community Edition** downloaded
using the [Toolbox App](https://www.jetbrains.com/toolbox-app/).

Press `Q` in the terminal to gracefully stop the server.

### Live Reload

Feel free to edit / add / delete new components, pages, and API endpoints! When you make any changes, the site will
indicate the status of the build and automatically reload when ready.

## Exporting the Project

When you are ready to ship, you should shutdown the development server and then export the project using:

```bash
kobweb export
```

When finished, you can run a Kobweb server in production mode:

```bash
kobweb run --env prod
```

If you want to run this command in the Cloud provider of your choice, consider disabling interactive mode since nobody
is sitting around watching the console in that case anyway. To do that, use:

```bash
kobweb run --env prod --notty
```

Kobweb also supports exporting to a static layout which is compatible with static hosting providers, such as GitHub
Pages, Netlify, Firebase, any presumably all the others. You can read more about that approach here:
https://bitspittle.dev/blog/2022/staticdeploy

# Contact
[LinkedIn](https://www.linkedin.com/in/kaaneneskpc/)

[Github](https://github.com/kaaneneskpc/)

[Send me an email](mailto:kaaneneskpc1@gmail.com)
