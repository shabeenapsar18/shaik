from django.contrib import admin
from django.urls import path
from userapp import views

urlpatterns = [
    path('admin/', admin.site.urls),
    path('f/',views.frist,name"first")
    path('s/',views.second,name"sec")
]


# Create your views here.
