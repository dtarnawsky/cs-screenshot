import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Camera, CameraResultType } from '@capacitor/camera';
import { Screenshots } from '@capacitor-community/screenshots';

@Component({
  selector: 'app-folder',
  templateUrl: './folder.page.html',
  styleUrls: ['./folder.page.scss'],
})
export class FolderPage implements OnInit {
  public folder!: string;

  public imageUrl: string | undefined;

  constructor(private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    this.folder = this.activatedRoute.snapshot.paramMap.get('id') as string;
  }

  async camera() {
    await Screenshots.enableScreenshots();
    const image = await Camera.getPhoto({
      quality: 90,
      allowEditing: true,
      resultType: CameraResultType.Uri
    });
    this.imageUrl = image.webPath;
    await Screenshots.disableScreenshots();
  }
}
