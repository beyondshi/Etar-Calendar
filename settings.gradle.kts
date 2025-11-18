import org.gradle.api.initialization.resolve.RepositoriesMode

pluginManagement {
    repositories {
        maven { url = uri("https://maven.aliyun.com/repository/public") } // 阿里云公共仓库
        maven { url = uri("https://maven.aliyun.com/repository/google") } // 阿里云 Google 仓库
        maven { url = uri("https://maven.aliyun.com/repository/jcenter") } // 阿里云 JCenter 仓库
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        maven { url = uri("https://maven.aliyun.com/repository/public") } // 阿里云公共仓库
        maven { url = uri("https://maven.aliyun.com/repository/google") } // 阿里云 Google 仓库
        maven { url = uri("https://maven.aliyun.com/repository/jcenter") } // 阿里云 JCenter 仓库
        google()
        mavenCentral()
    }
}
rootProject.name = "Etar-Calendar"
include(":app")
